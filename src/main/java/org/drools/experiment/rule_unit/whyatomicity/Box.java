package org.drools.experiment.rule_unit.whyatomicity;

import org.kie.api.definition.type.PropertyReactive;

@PropertyReactive
public class Box {
    private String type;
    private Boolean open;
    private Object content;
    public Box(String type, Boolean open, Object content) {
        this.type = type;
        this.open = open;
        this.content = content;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public Boolean getOpen() {
        return open;
    }
    public void setOpen(Boolean open) {
        this.open = open;
    }
    public Object getContent() {
        return content;
    }
    public void setContent(Object content) {
        this.content = content;
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Box [type=").append(type).append(", open=").append(open).append(", content=").append(content).append("]");
        return builder.toString();
    }
    
}
