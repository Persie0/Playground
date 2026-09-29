package p000;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class x4b extends dha {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f67762a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ z4b f67763b;

    public /* synthetic */ x4b(z4b z4bVar, int i) {
        this.f67762a = i;
        this.f67763b = z4bVar;
    }

    @Override // p000.zua
    /* JADX INFO: renamed from: c */
    public final void mo17716c() {
        View view;
        int i = this.f67762a;
        z4b z4bVar = this.f67763b;
        switch (i) {
            case 0:
                if (z4bVar.f70919o && (view = z4bVar.f70911g) != null) {
                    view.setTranslationY(0.0f);
                    z4bVar.f70908d.setTranslationY(0.0f);
                }
                z4bVar.f70908d.setVisibility(8);
                z4bVar.f70908d.setTransitioning(false);
                z4bVar.f70923s = null;
                C3156jq c3156jq = z4bVar.f70915k;
                if (c3156jq != null) {
                    c3156jq.m14589C(z4bVar.f70914j);
                    z4bVar.f70914j = null;
                    z4bVar.f70915k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = z4bVar.f70907c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = dta.f36217a;
                    actionBarOverlayLayout.requestApplyInsets();
                }
                break;
            default:
                z4bVar.f70923s = null;
                z4bVar.f70908d.requestLayout();
                break;
        }
    }
}
