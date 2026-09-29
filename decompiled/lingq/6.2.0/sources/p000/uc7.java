package p000;

import com.lingq.feature.playlist.PlaylistActionMenuItem;

/* JADX INFO: loaded from: classes3.dex */
public final class uc7 implements ad7 {

    /* JADX INFO: renamed from: a */
    public final PlaylistActionMenuItem f63719a;

    public uc7(PlaylistActionMenuItem playlistActionMenuItem) {
        playlistActionMenuItem.getClass();
        this.f63719a = playlistActionMenuItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uc7) && this.f63719a == ((uc7) obj).f63719a;
    }

    public final int hashCode() {
        return this.f63719a.hashCode();
    }

    public final String toString() {
        return "OnMenuItemSelected(menuItem=" + this.f63719a + ")";
    }
}
