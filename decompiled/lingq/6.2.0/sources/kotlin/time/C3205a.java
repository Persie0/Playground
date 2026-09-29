package kotlin.time;

import p000.h74;
import p000.kuc;

/* JADX INFO: renamed from: kotlin.time.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C3205a implements h74 {

    /* JADX INFO: renamed from: a */
    public final String f47737a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f47738b;

    public C3205a(CharSequence charSequence, String str) {
        charSequence.getClass();
        this.f47737a = str;
        this.f47738b = charSequence;
    }

    @Override // p000.h74
    public final Instant toInstant() {
        throw new InstantFormatException(this.f47737a + " when parsing an Instant from \"" + kuc.m15702h(this.f47738b, 64) + '\"');
    }
}
