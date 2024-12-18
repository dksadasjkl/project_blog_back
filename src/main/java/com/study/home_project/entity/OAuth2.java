package com.study.home_project.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OAuth2 {
    private int oAuth2Id;
    private int adminId;
    private String oAuth2Name;
    private String providerName;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;
}
