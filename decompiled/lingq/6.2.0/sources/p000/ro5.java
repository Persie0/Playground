package p000;

import android.view.View;
import androidx.compose.p002ui.platform.ComposeView;
import com.lingq.p020ui.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ro5 implements mf9, gr6 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MainActivity f59652a;

    public /* synthetic */ ro5(MainActivity mainActivity) {
        this.f59652a = mainActivity;
    }

    @Override // p000.mf9
    /* JADX INFO: renamed from: a */
    public boolean mo13968a() {
        int i = MainActivity.f33994m0;
        return ((Boolean) this.f59652a.m9802q().f34198H.getValue()).booleanValue();
    }

    @Override // p000.gr6
    /* JADX INFO: renamed from: s */
    public f6b mo1889s(View view, f6b f6bVar) {
        int i = MainActivity.f33994m0;
        view.getClass();
        l64 l64VarMo136i = f6bVar.f38536a.mo136i(519);
        l64VarMo136i.getClass();
        ComposeView composeView = this.f59652a.m9801o().f70968d;
        composeView.setPadding(composeView.getPaddingLeft(), l64VarMo136i.f49117b, composeView.getPaddingRight(), composeView.getPaddingBottom());
        return f6bVar;
    }
}
