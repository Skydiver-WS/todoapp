package com.example.todoapp.web.request.note;

import com.example.todoapp.config.Tag;
import com.example.todoapp.config.anotations.ValidTag;
import com.example.todoapp.model.CheckListItem;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateNoteRequest {
    @Size(min = 1, max = 30)
    private String title;
    private String description;
    private Boolean visibility;
    @ValidTag
    private Tag tag;
    private List<CheckListItem> checkListItems;
}