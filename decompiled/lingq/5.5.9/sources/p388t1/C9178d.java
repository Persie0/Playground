package p388t1;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.emoji2.text.C0892f;
import dm.C5206f;
import dm.C5207g;
import p081e0.InterfaceC5301c1;
import p081e0.InterfaceC5312g0;
import p338qd.C8573r0;

/* JADX INFO: renamed from: t1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C9178d {

    /* JADX INFO: renamed from: a */
    public InterfaceC5301c1<Boolean> f47715a;

    /* JADX INFO: renamed from: t1.d$a */
    public static final class a extends C0892f.f {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC5312g0<Boolean> f47716a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C9178d f47717b;

        public a(ParcelableSnapshotMutableState parcelableSnapshotMutableState, C9178d c9178d) {
            this.f47716a = parcelableSnapshotMutableState;
            this.f47717b = c9178d;
        }

        @Override // androidx.emoji2.text.C0892f.f
        /* JADX INFO: renamed from: a */
        public final void mo1047a() {
            this.f47717b.f47715a = C5206f.f33275j;
        }

        @Override // androidx.emoji2.text.C0892f.f
        /* JADX INFO: renamed from: b */
        public final void mo1048b() {
            this.f47716a.setValue(Boolean.TRUE);
            this.f47717b.f47715a = new C9180f(true);
        }
    }

    public C9178d() {
        this.f47715a = C0892f.m3520c() ? m17511a() : null;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC5301c1<Boolean> m17511a() {
        C0892f c0892fM3519a = C0892f.m3519a();
        C5207g.m11110e(c0892fM3519a, "get()");
        if (c0892fM3519a.m3521b() == 1) {
            return new C9180f(true);
        }
        ParcelableSnapshotMutableState parcelableSnapshotMutableStateM16684L0 = C8573r0.m16684L0(Boolean.FALSE);
        c0892fM3519a.m3527i(new a(parcelableSnapshotMutableStateM16684L0, this));
        return parcelableSnapshotMutableStateM16684L0;
    }
}
