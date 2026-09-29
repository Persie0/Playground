package ph;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.switchmaterial.SwitchMaterial;
import p473x4.InterfaceC10075a;

/* JADX INFO: renamed from: ph.c3 */
/* JADX INFO: loaded from: classes.dex */
public final class C8265c3 implements InterfaceC10075a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f44645a;

    /* JADX INFO: renamed from: b */
    public final ViewGroup f44646b;

    /* JADX INFO: renamed from: c */
    public final View f44647c;

    /* JADX INFO: renamed from: d */
    public final View f44648d;

    public /* synthetic */ C8265c3(RelativeLayout relativeLayout, View view, View view2, int i10) {
        this.f44645a = i10;
        this.f44646b = relativeLayout;
        this.f44647c = view;
        this.f44648d = view2;
    }

    public C8265c3(ConstraintLayout constraintLayout, SwitchMaterial switchMaterial, TextView textView) {
        this.f44645a = 2;
        this.f44646b = constraintLayout;
        this.f44648d = switchMaterial;
        this.f44647c = textView;
    }
}
