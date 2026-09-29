package p000;

import android.os.Bundle;
import com.lingq.R$id;

/* JADX INFO: loaded from: classes2.dex */
public final class qb6 implements t86 {

    /* JADX INFO: renamed from: a */
    public final String f57543a;

    /* JADX INFO: renamed from: b */
    public final int f57544b;

    /* JADX INFO: renamed from: c */
    public final int f57545c = R$id.actionToChat;

    public qb6(String str, int i) {
        this.f57543a = str;
        this.f57544b = i;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: a */
    public final Bundle mo233a() {
        Bundle bundle = new Bundle();
        bundle.putString("openLocation", this.f57543a);
        bundle.putInt("chatId", this.f57544b);
        return bundle;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: b */
    public final int mo234b() {
        return this.f57545c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qb6)) {
            return false;
        }
        qb6 qb6Var = (qb6) obj;
        return this.f57543a.equals(qb6Var.f57543a) && this.f57544b == qb6Var.f57544b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f57544b) + (this.f57543a.hashCode() * 31);
    }

    public final String toString() {
        return "ActionToChat(openLocation=" + this.f57543a + ", chatId=" + this.f57544b + ")";
    }
}
