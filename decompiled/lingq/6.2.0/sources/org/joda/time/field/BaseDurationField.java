package org.joda.time.field;

import java.io.Serializable;
import org.joda.time.DurationFieldType;
import p000.C3386nv;
import p000.en2;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseDurationField extends en2 implements Serializable {
    private static final long serialVersionUID = -2554245107589433218L;
    private final DurationFieldType iType;

    public BaseDurationField(DurationFieldType durationFieldType) {
        if (durationFieldType != null) {
            this.iType = durationFieldType;
        } else {
            C3386nv.m17626m("The type must not be null");
            throw null;
        }
    }

    @Override // p000.en2
    /* JADX INFO: renamed from: c */
    public final DurationFieldType mo11270c() {
        return this.iType;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long jMo11271d = ((en2) obj).mo11271d();
        long jMo11271d2 = mo11271d();
        if (jMo11271d2 == jMo11271d) {
            return 0;
        }
        return jMo11271d2 < jMo11271d ? -1 : 1;
    }

    @Override // p000.en2
    /* JADX INFO: renamed from: f */
    public final boolean mo11273f() {
        return true;
    }

    public final String toString() {
        return "DurationField[" + this.iType.m18362b() + ']';
    }
}
