package p000;

import android.graphics.drawable.Drawable;
import com.google.android.material.progressindicator.AbstractC1068a;

/* JADX INFO: loaded from: classes.dex */
public final class w90 extends AbstractC3689vl {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f66544b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC1068a f66545c;

    public /* synthetic */ w90(AbstractC1068a abstractC1068a, int i) {
        this.f66544b = i;
        this.f66545c = abstractC1068a;
    }

    @Override // p000.AbstractC3689vl
    /* JADX INFO: renamed from: a */
    public final void mo23406a(Drawable drawable) {
        int i = this.f66544b;
        AbstractC1068a abstractC1068a = this.f66545c;
        switch (i) {
            case 0:
                abstractC1068a.setIndeterminate(false);
                abstractC1068a.mo6160d(abstractC1068a.f13071b);
                break;
            default:
                if (!abstractC1068a.f13077h) {
                    abstractC1068a.setVisibility(abstractC1068a.f13078i);
                }
                break;
        }
    }
}
