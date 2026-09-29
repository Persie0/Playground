package androidx.compose.foundation.text;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import cm.InterfaceC2052l;
import dm.C5207g;
import p081e0.C5314h0;
import p127g1.InterfaceC5647k;
import p231l1.C7216j;
import p338qd.C8573r0;
import p375s0.C8941c;
import p387t0.C9169u;
import p519z.C10423b;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class TextState {

    /* JADX INFO: renamed from: a */
    public final long f2560a;

    /* JADX INFO: renamed from: c */
    public InterfaceC5647k f2562c;

    /* JADX INFO: renamed from: d */
    public C10423b f2563d;

    /* JADX INFO: renamed from: e */
    public C7216j f2564e;

    /* JADX INFO: renamed from: g */
    public final ParcelableSnapshotMutableState f2566g;

    /* JADX INFO: renamed from: h */
    public final ParcelableSnapshotMutableState f2567h;

    /* JADX INFO: renamed from: b */
    public InterfaceC2052l<? super C7216j, C9072e> f2561b = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.TextState$onTextLayout$1
        @Override // cm.InterfaceC2052l
        /* JADX INFO: renamed from: n */
        public final C9072e mo528n(C7216j c7216j) {
            C5207g.m11111f(c7216j, "it");
            return C9072e.f47360a;
        }
    };

    /* JADX INFO: renamed from: f */
    public long f2565f = C8941c.f46888b;

    public TextState(C10423b c10423b, long j10) {
        this.f2560a = j10;
        this.f2563d = c10423b;
        int i10 = C9169u.f47704g;
        C9072e c9072e = C9072e.f47360a;
        C5314h0 c5314h0 = C5314h0.f33585a;
        this.f2566g = C8573r0.m16682K0(c9072e, c5314h0);
        this.f2567h = C8573r0.m16682K0(c9072e, c5314h0);
    }
}
