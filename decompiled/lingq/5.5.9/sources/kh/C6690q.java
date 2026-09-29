package kh;

import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import com.linguist.R;
import p040c4.InterfaceC1687l;

/* JADX INFO: renamed from: kh.q */
/* JADX INFO: loaded from: classes.dex */
public final class C6690q implements InterfaceC1687l {

    /* JADX INFO: renamed from: a */
    public final int f37833a;

    /* JADX INFO: renamed from: b */
    public final int f37834b;

    public C6690q() {
        this(0);
    }

    public C6690q(int i10) {
        this.f37833a = i10;
        this.f37834b = R.id.actionToReviewSettings;
    }

    @Override // p040c4.InterfaceC1687l
    /* JADX INFO: renamed from: d */
    public final Bundle mo482d() {
        Bundle bundle = new Bundle();
        bundle.putInt("viewKey", this.f37833a);
        return bundle;
    }

    @Override // p040c4.InterfaceC1687l
    /* JADX INFO: renamed from: e */
    public final int mo483e() {
        return this.f37834b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6690q) && this.f37833a == ((C6690q) obj).f37833a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f37833a);
    }

    public final String toString() {
        return C0166e.m768o(new StringBuilder("ActionToReviewSettings(viewKey="), this.f37833a, ")");
    }
}
