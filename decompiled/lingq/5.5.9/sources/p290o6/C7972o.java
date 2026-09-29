package p290o6;

import android.support.v4.media.AbstractC0140a;
import com.clevertap.android.sdk.C2181a;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.displayunits.model.CleverTapDisplayUnit;
import java.util.ArrayList;

/* JADX INFO: renamed from: o6.o */
/* JADX INFO: loaded from: classes.dex */
public final class C7972o extends AbstractC0140a {

    /* JADX INFO: renamed from: a */
    public final ArrayList f43389a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final CleverTapInstanceConfig f43390b;

    /* JADX INFO: renamed from: c */
    public final C7951d0 f43391c;

    /* JADX INFO: renamed from: d */
    public InterfaceC7955f0 f43392d;

    public C7972o(CleverTapInstanceConfig cleverTapInstanceConfig, C7951d0 c7951d0) {
        this.f43390b = cleverTapInstanceConfig;
        this.f43391c = c7951d0;
    }

    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: C */
    public final void mo567C() {
    }

    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: D */
    public final void mo568D() {
    }

    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: F */
    public final void mo569F() {
    }

    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: H */
    public final void mo570H() {
    }

    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: I */
    public final void mo571I() {
    }

    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: J */
    public final void mo572J() {
    }

    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: K */
    public final void mo573K() {
    }

    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: M */
    public final void mo575M() {
    }

    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: N */
    public final void mo576N() {
    }

    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: O */
    public final ArrayList mo577O() {
        return this.f43389a;
    }

    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: P */
    public final void mo578P() {
    }

    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: R */
    public final void mo580R() {
    }

    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: T */
    public final void mo582T(ArrayList<CleverTapDisplayUnit> arrayList) {
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f43390b;
        if (arrayList == null || arrayList.isEmpty()) {
            cleverTapInstanceConfig.m6433b().getClass();
            C2181a.m6460m(cleverTapInstanceConfig.f10995a, "DisplayUnit : No Display Units found");
        } else {
            cleverTapInstanceConfig.m6433b().getClass();
            C2181a.m6460m(cleverTapInstanceConfig.f10995a, "DisplayUnit : No registered listener, failed to notify");
        }
    }

    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: U */
    public final void mo583U(String str) {
        if (str != null) {
            return;
        }
        this.f43391c.m15765i();
    }

    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: d */
    public final void mo593d() {
    }

    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: h */
    public final void mo597h() {
    }

    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: z */
    public final InterfaceC7955f0 mo608z() {
        return this.f43392d;
    }
}
