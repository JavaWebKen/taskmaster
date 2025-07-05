package com.training.taskmaster.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;




class ProjectTest {

    private Project project;

    @BeforeEach
    void setUp() {
        project = new Project();
        project.setTasks(new ArrayList<>());
    }

    @Test
    void testAddTask() {
        Task task = mock(Task.class);

        project.addTask(task);

        assertTrue(project.getTasks().contains(task));
        verify(task).setProject(project);
    }

    @Test
    void testRemoveTask() {
        Task task = mock(Task.class);
        project.getTasks().add(task);

        project.removeTask(task);

        assertFalse(project.getTasks().contains(task));
        verify(task).setProject(null);
    }

    @Test
    void testSettersAndGetters() {
        project.setId(1L);
        project.setName("Test Project");
        project.setDescription("Description");

        assertEquals(1L, project.getId());
        assertEquals("Test Project", project.getName());
        assertEquals("Description", project.getDescription());
    }

    @Test
    void testNoArgsConstructor() {
        Project newProject = new Project();
        assertNotNull(newProject);
    }
}