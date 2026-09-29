package org.joda.time.field;

import java.io.Serializable;
import java.util.HashMap;
import org.joda.time.DurationFieldType;
import p000.en2;

/* JADX INFO: loaded from: classes.dex */
public final class UnsupportedDurationField extends en2 implements Serializable {

    /* JADX INFO: renamed from: a */
    public static HashMap f54922a = null;
    private static final long serialVersionUID = -6390301302770925357L;
    private final DurationFieldType iType;

    public UnsupportedDurationField(DurationFieldType durationFieldType) {
        this.iType = durationFieldType;
    }

    /* JADX INFO: renamed from: h */
    public static synchronized UnsupportedDurationField m18450h(DurationFieldType durationFieldType) {
        UnsupportedDurationField unsupportedDurationField;
        try {
            HashMap map = f54922a;
            if (map == null) {
                f54922a = new HashMap(7);
                unsupportedDurationField = null;
            } else {
                unsupportedDurationField = (UnsupportedDurationField) map.get(durationFieldType);
            }
            if (unsupportedDurationField == null) {
                unsupportedDurationField = new UnsupportedDurationField(durationFieldType);
                f54922a.put(durationFieldType, unsupportedDurationField);
            }
        } catch (Throwable th) {
            throw th;
        }
        return unsupportedDurationField;
    }

    private Object readResolve() {
        return m18450h(this.iType);
    }

    @Override // p000.en2
    /* JADX INFO: renamed from: a */
    public final long mo11268a(int i, long j) {
        throw new UnsupportedOperationException(this.iType + " field is unsupported");
    }

    @Override // p000.en2
    /* JADX INFO: renamed from: b */
    public final long mo11269b(long j, long j2) {
        throw new UnsupportedOperationException(this.iType + " field is unsupported");
    }

    @Override // p000.en2
    /* JADX INFO: renamed from: c */
    public final DurationFieldType mo11270c() {
        return this.iType;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return 0;
    }

    @Override // p000.en2
    /* JADX INFO: renamed from: d */
    public final long mo11271d() {
        return 0L;
    }

    @Override // p000.en2
    /* JADX INFO: renamed from: e */
    public final boolean mo11272e() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnsupportedDurationField)) {
            return false;
        }
        UnsupportedDurationField unsupportedDurationField = (UnsupportedDurationField) obj;
        if (unsupportedDurationField.iType.m18362b() == null) {
            return this.iType.m18362b() == null;
        }
        return unsupportedDurationField.iType.m18362b().equals(this.iType.m18362b());
    }

    @Override // p000.en2
    /* JADX INFO: renamed from: f */
    public final boolean mo11273f() {
        return false;
    }

    public final int hashCode() {
        return this.iType.m18362b().hashCode();
    }

    public final String toString() {
        return "UnsupportedDurationField[" + this.iType.m18362b() + ']';
    }
}
