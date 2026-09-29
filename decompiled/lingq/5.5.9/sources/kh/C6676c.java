package kh;

import android.os.Bundle;
import com.linguist.R;
import dm.C5207g;
import p003a2.C0009a;
import p040c4.InterfaceC1687l;

/* JADX INFO: renamed from: kh.c */
/* JADX INFO: loaded from: classes.dex */
public final class C6676c implements InterfaceC1687l {

    /* JADX INFO: renamed from: a */
    public final String f37769a;

    /* JADX INFO: renamed from: b */
    public final String f37770b;

    /* JADX INFO: renamed from: c */
    public final int f37771c = R.id.actionToChallengeShare;

    public C6676c(String str, String str2) {
        this.f37769a = str;
        this.f37770b = str2;
    }

    @Override // p040c4.InterfaceC1687l
    /* JADX INFO: renamed from: d */
    public final Bundle mo482d() {
        Bundle bundle = new Bundle();
        bundle.putString("challengeCode", this.f37769a);
        bundle.putString("title", this.f37770b);
        return bundle;
    }

    @Override // p040c4.InterfaceC1687l
    /* JADX INFO: renamed from: e */
    public final int mo483e() {
        return this.f37771c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6676c)) {
            return false;
        }
        C6676c c6676c = (C6676c) obj;
        return C5207g.m11106a(this.f37769a, c6676c.f37769a) && C5207g.m11106a(this.f37770b, c6676c.f37770b);
    }

    public final int hashCode() {
        return this.f37770b.hashCode() + (this.f37769a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActionToChallengeShare(challengeCode=");
        sb2.append(this.f37769a);
        sb2.append(", title=");
        return C0009a.m23l(sb2, this.f37770b, ")");
    }
}
