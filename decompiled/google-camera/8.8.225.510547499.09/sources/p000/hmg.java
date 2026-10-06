package p000;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hmg extends RecyclerView {
    public hmg(Context context) {
        super(context);
        setFocusable(false);
        setOverScrollMode(2);
        m1243as();
        setPaddingRelative(getResources().getDimensionPixelSize(C0100R.dimen.settings_changed_view_padding_start), 0, 0, 0);
        getContext();
        m1228aa(new LinearLayoutManager());
        m1246av(new hmd(getResources()));
        mo1226Y(new hmf(getResources()));
    }
}
