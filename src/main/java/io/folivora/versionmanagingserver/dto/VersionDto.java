package io.folivora.versionmanagingserver.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VersionDto {
    String version;

    String description;

    String windowsFileName;

}
