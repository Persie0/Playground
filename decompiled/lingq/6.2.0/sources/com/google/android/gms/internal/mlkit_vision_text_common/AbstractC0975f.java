package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Map;
import java.util.Set;
import p000.hsb;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_text_common.f */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0975f implements hsb {

    /* JADX INFO: renamed from: a */
    public transient C0973d f12034a;

    /* JADX INFO: renamed from: b */
    public transient C0972c f12035b;

    /* JADX INFO: renamed from: a */
    public final Map m5473a() {
        C0972c c0972c = this.f12035b;
        if (c0972c != null) {
            return c0972c;
        }
        zzal zzalVar = (zzal) this;
        C0972c c0972c2 = new C0972c(zzalVar, zzalVar.f12070c);
        this.f12035b = c0972c2;
        return c0972c2;
    }

    /* JADX INFO: renamed from: b */
    public final Set m5474b() {
        C0973d c0973d = this.f12034a;
        if (c0973d != null) {
            return c0973d;
        }
        zzal zzalVar = (zzal) this;
        C0973d c0973d2 = new C0973d(zzalVar, zzalVar.f12070c);
        this.f12034a = c0973d2;
        return c0973d2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hsb) {
            return m5473a().equals(((AbstractC0975f) ((hsb) obj)).m5473a());
        }
        return false;
    }

    public final int hashCode() {
        return ((C0972c) m5473a()).f12024c.hashCode();
    }

    public final String toString() {
        return ((C0972c) m5473a()).f12024c.toString();
    }
}
