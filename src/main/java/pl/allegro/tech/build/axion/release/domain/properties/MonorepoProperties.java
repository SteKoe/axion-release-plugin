package pl.allegro.tech.build.axion.release.domain.properties;

import groovy.transform.Immutable;

import java.util.Collections;
import java.util.List;

public class MonorepoProperties {

    private final List<String> dirsToExclude;

    public MonorepoProperties() {
        this.dirsToExclude = Collections.emptyList();
    }

    public MonorepoProperties(List<String> dirsToExclude) {
        this.dirsToExclude = Collections.unmodifiableList(dirsToExclude);
    }

    public List<String> getDirsToExclude() {
        return dirsToExclude;
    }
}
