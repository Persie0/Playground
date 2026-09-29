package org.joda.time.field;

import java.io.Serializable;
import org.joda.time.DurationFieldType;
import p000.en2;
import p000.xwc;

/* JADX INFO: loaded from: classes.dex */
public final class MillisDurationField extends en2 implements Serializable {

    /* JADX INFO: renamed from: a */
    public static final MillisDurationField f54920a = new MillisDurationField();
    private static final long serialVersionUID = 2656707858124633367L;

    private Object readResolve() {
        return f54920a;
    }

    @Override // p000.en2
    /* JADX INFO: renamed from: a */
    public final long mo11268a(int i, long j) {
        return xwc.m24757b0(j, i);
    }

    @Override // p000.en2
    /* JADX INFO: renamed from: b */
    public final long mo11269b(long j, long j2) {
        return xwc.m24757b0(j, j2);
    }

    @Override // p000.en2
    /* JADX INFO: renamed from: c */
    public final DurationFieldType mo11270c() {
        return DurationFieldType.f54845l;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long jMo11271d = ((en2) obj).mo11271d();
        if (1 == jMo11271d) {
            return 0;
        }
        return 1 < jMo11271d ? -1 : 1;
    }

    @Override // p000.en2
    /* JADX INFO: renamed from: d */
    public final long mo11271d() {
        return 1L;
    }

    @Override // p000.en2
    /* JADX INFO: renamed from: e */
    public final boolean mo11272e() {
        return true;
    }

    public final boolean equals(Object obj) {
        return obj instanceof MillisDurationField;
    }

    @Override // p000.en2
    /* JADX INFO: renamed from: f */
    public final boolean mo11273f() {
        return true;
    }

    public final int hashCode() {
        return 1;
    }

    public final String toString() {
        return "DurationField[millis]";
    }
}
