package p221kc;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* JADX INFO: renamed from: kc.b */
/* JADX INFO: loaded from: classes.dex */
public final class C6655b extends FloatingActionButton.AbstractC3029a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f37724a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ BottomAppBar f37725b;

    /* JADX INFO: renamed from: kc.b$a */
    public class a extends FloatingActionButton.AbstractC3029a {
        public a() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.AbstractC3029a
        /* JADX INFO: renamed from: b */
        public final void mo8774b() {
            BottomAppBar bottomAppBar = C6655b.this.f37725b;
            int i10 = BottomAppBar.f14794E0;
            bottomAppBar.getClass();
        }
    }

    public C6655b(BottomAppBar bottomAppBar, int i10) {
        this.f37725b = bottomAppBar;
        this.f37724a = i10;
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.AbstractC3029a
    /* JADX INFO: renamed from: a */
    public final void mo8773a(FloatingActionButton floatingActionButton) {
        floatingActionButton.setTranslationX(this.f37725b.m8600z(this.f37724a));
        floatingActionButton.m8769k(new a(), true);
    }
}
