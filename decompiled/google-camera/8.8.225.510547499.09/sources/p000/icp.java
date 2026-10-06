package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class icp implements igs {

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f30367c;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ icp f30366b = new icp(1);

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ icp f30365a = new icp(0);

    private /* synthetic */ icp(int i) {
        this.f30367c = i;
    }

    @Override // p000.igs
    /* JADX INFO: renamed from: a */
    public final View mo11072a(Context context) {
        switch (this.f30367c) {
            case 0:
                return LayoutInflater.from(context).inflate(C0100R.layout.translate_tooltip, (ViewGroup) null);
            default:
                return LayoutInflater.from(context).inflate(C0100R.layout.longshot_notification_tooltip, (ViewGroup) null);
        }
    }
}
