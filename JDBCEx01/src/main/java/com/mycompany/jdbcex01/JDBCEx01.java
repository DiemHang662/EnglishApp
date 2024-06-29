package com.mycompany.jdbcex01;

import com.demo.pojo.Category;
import com.demo.pojo.Choice;
import com.demo.pojo.Question;
import com.demo.services.CategoryServices;
import com.demo.services.QuestionServices;

import java.sql.SQLException;
import java.util.List;

public class JDBCEx01 {
    public static void main(String[] args) {
        try {
            // List all categories
            List<Category> categories = CategoryServices.getCategories();
            System.out.println("Categories:");
            for (Category category : categories) {
                System.out.println(category.getId() + ": " + category.getName());
            }

            // List all questions
            List<Question> questions = QuestionServices.getQuestions(null);
            System.out.println("\nQuestions:");
            for (Question question : questions) {
                System.out.println(question.getId() + ": " + question.getContent());
            }

            // Get a specific question by ID
            String questionId = "1"; // Replace with a valid question ID
            Question question = QuestionServices.getQuestionById(questionId);
            if (question != null) {
                System.out.println("\nQuestion Details:");
                System.out.println("ID: " + question.getId());
                System.out.println("Content: " + question.getContent());
                System.out.println("Category: " + question.getCategory().getName());

                // Get choices for the specific question
                List<Choice> choices = QuestionServices.getChoicesByQuestionId(questionId);
                System.out.println("Choices:");
                for (Choice choice : choices) {
                    System.out.println(choice.getId() + ": " + choice.getContent() + " (Correct: " + choice.isCorrect() + ")");
                }
            } else {
                System.out.println("Question with ID " + questionId + " not found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
