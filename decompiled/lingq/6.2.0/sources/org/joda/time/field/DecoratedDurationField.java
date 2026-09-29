package org.joda.time.field;

import org.joda.time.DurationFieldType;
import p000.C3386nv;
import p000.en2;

/* JADX INFO: loaded from: classes.dex */
public abstract class DecoratedDurationField extends BaseDurationField {
    private static final long serialVersionUID = 8019982251647420015L;
    private final en2 iField;

    public DecoratedDurationField(en2 en2Var, DurationFieldType durationFieldType) {
        super(durationFieldType);
        if (en2Var.mo11273f()) {
            this.iField = en2Var;
        } else {
            C3386nv.m17626m("The field must be supported");
            throw null;
        }
    }

    @Override // p000.en2
    /* JADX INFO: renamed from: e */
    public final boolean mo11272e() {
        return this.iField.mo11272e();
    }

    /* JADX INFO: renamed from: h */
    public final en2 m18447h() {
        return this.iField;
    }
}
