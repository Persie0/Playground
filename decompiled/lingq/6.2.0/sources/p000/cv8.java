package p000;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.selection.SelectionHandleAnchor;

/* JADX INFO: loaded from: classes.dex */
public final class cv8 {

    /* JADX INFO: renamed from: a */
    public final Handle f34610a;

    /* JADX INFO: renamed from: b */
    public final long f34611b;

    /* JADX INFO: renamed from: c */
    public final SelectionHandleAnchor f34612c;

    /* JADX INFO: renamed from: d */
    public final boolean f34613d;

    public cv8(Handle handle, long j, SelectionHandleAnchor selectionHandleAnchor, boolean z) {
        this.f34610a = handle;
        this.f34611b = j;
        this.f34612c = selectionHandleAnchor;
        this.f34613d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cv8)) {
            return false;
        }
        cv8 cv8Var = (cv8) obj;
        return this.f34610a == cv8Var.f34610a && gq6.m12821b(this.f34611b, cv8Var.f34611b) && this.f34612c == cv8Var.f34612c && this.f34613d == cv8Var.f34613d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f34613d) + ((this.f34612c.hashCode() + ux5.m22981d(this.f34611b, this.f34610a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionHandleInfo(handle=");
        sb.append(this.f34610a);
        sb.append(", position=");
        sb.append((Object) gq6.m12827h(this.f34611b));
        sb.append(", anchor=");
        sb.append(this.f34612c);
        sb.append(", visible=");
        return ux5.m22993p(sb, this.f34613d, ')');
    }
}
