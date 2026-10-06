package p000;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import androidx.preference.Preference;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anv implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a */
    private final Preference f1851a;

    public anv(Preference preference) {
        this.f1851a = preference;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        CharSequence charSequenceMo1478m = this.f1851a.mo1478m();
        if (!this.f1851a.f1598z || TextUtils.isEmpty(charSequenceMo1478m)) {
            return;
        }
        contextMenu.setHeaderTitle(charSequenceMo1478m);
        contextMenu.add(0, 0, 0, C0100R.string.copy).setOnMenuItemClickListener(this);
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        ((ClipboardManager) this.f1851a.f1582j.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Preference", this.f1851a.mo1478m()));
        return true;
    }
}
