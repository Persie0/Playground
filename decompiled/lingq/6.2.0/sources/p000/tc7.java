package p000;

import com.lingq.feature.playlist.MenuPlaylistItem;

/* JADX INFO: loaded from: classes3.dex */
public final class tc7 implements ad7 {

    /* JADX INFO: renamed from: a */
    public final MenuPlaylistItem f62152a;

    /* JADX INFO: renamed from: b */
    public final ud7 f62153b;

    public tc7(MenuPlaylistItem menuPlaylistItem, ud7 ud7Var) {
        menuPlaylistItem.getClass();
        ud7Var.getClass();
        this.f62152a = menuPlaylistItem;
        this.f62153b = ud7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tc7)) {
            return false;
        }
        tc7 tc7Var = (tc7) obj;
        return this.f62152a == tc7Var.f62152a && fa4.m11650l(this.f62153b, tc7Var.f62153b);
    }

    public final int hashCode() {
        return this.f62153b.hashCode() + (this.f62152a.hashCode() * 31);
    }

    public final String toString() {
        return "OnItemMenuSelected(menuItem=" + this.f62152a + ", lesson=" + this.f62153b + ")";
    }
}
