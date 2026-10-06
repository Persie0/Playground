package p000;

import android.app.ActionBar;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.wear.ambient.AmbientMode;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class bos extends ActivityC0080bz {

    /* JADX INFO: renamed from: q */
    private jgy f4026q;

    /* JADX INFO: renamed from: h */
    private final jgy m2824h() {
        if (this.f4026q == null) {
            this.f4026q = new jgy(new AmbientMode.AmbientController(this), null);
        }
        return this.f4026q;
    }

    @Override // p000.ActivityC0907pl, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        if (m3206bA().m5316a() == 0) {
            finishAfterTransition();
        }
    }

    @Override // p000.ActivityC0080bz, p000.ActivityC0907pl, p000.ActivityC0136do, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        jgy jgyVarM2824h = m2824h();
        View viewInflate = getLayoutInflater().inflate(C0100R.layout.collapsing_toolbar_base_layout, (ViewGroup) null, false);
        if (viewInflate instanceof CoordinatorLayout) {
        }
        jgyVarM2824h.f34011c = (CollapsingToolbarLayout) viewInflate.findViewById(C0100R.id.collapsing_toolbar);
        jgyVarM2824h.f34012d = (AppBarLayout) viewInflate.findViewById(C0100R.id.app_bar);
        Object obj = jgyVarM2824h.f34011c;
        if (obj != null) {
            ((CollapsingToolbarLayout) obj).f8034a.f40647F = 1.1f;
        }
        Object obj2 = jgyVarM2824h.f34012d;
        if (obj2 != null) {
            aal aalVar = (aal) ((AppBarLayout) obj2).getLayoutParams();
            AppBarLayout.Behavior behavior = new AppBarLayout.Behavior();
            ((AppBarLayout.BaseBehavior) behavior).f8024c = new kxk((byte[]) null);
            aalVar.m24b(behavior);
        }
        jgyVarM2824h.f34009a = (FrameLayout) viewInflate.findViewById(C0100R.id.content_frame);
        jgyVarM2824h.f34010b = (Toolbar) viewInflate.findViewById(C0100R.id.action_bar);
        Object obj3 = jgyVarM2824h.f34013e;
        AmbientMode.AmbientController ambientController = (AmbientMode.AmbientController) obj3;
        super.setActionBar((Toolbar) jgyVarM2824h.f34010b);
        ActionBar actionBar = super.getActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayShowTitleEnabled(true);
        }
        super.setContentView(viewInflate);
    }

    @Override // android.app.Activity
    public final boolean onNavigateUp() {
        if (m3206bA().m5316a() > 0) {
            m3206bA().m5314W();
        }
        if (m3206bA().m5316a() != 0) {
            return true;
        }
        finishAfterTransition();
        return true;
    }

    @Override // p000.ActivityC0907pl, android.app.Activity
    public final void setContentView(int i) {
        jgy jgyVar = this.f4026q;
        Object obj = jgyVar == null ? (ViewGroup) findViewById(C0100R.id.content_frame) : jgyVar.f34009a;
        if (obj != null) {
            ((ViewGroup) obj).removeAllViews();
        }
        LayoutInflater.from(this).inflate(i, (ViewGroup) obj);
    }

    @Override // android.app.Activity
    public final void setTitle(int i) {
        setTitle(getText(i));
    }

    @Override // android.app.Activity
    public final void setTitle(CharSequence charSequence) {
        jgy jgyVarM2824h = m2824h();
        Object obj = jgyVarM2824h.f34011c;
        if (obj != null) {
            ((CollapsingToolbarLayout) obj).m4787f(charSequence);
        } else {
            super.setTitle(charSequence);
        }
    }

    @Override // p000.ActivityC0907pl, android.app.Activity
    public final void setContentView(View view) {
        jgy jgyVar = this.f4026q;
        Object obj = jgyVar == null ? (ViewGroup) findViewById(C0100R.id.content_frame) : jgyVar.f34009a;
        if (obj != null) {
            ((ViewGroup) obj).addView(view);
        }
    }

    @Override // p000.ActivityC0907pl, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        jgy jgyVar = this.f4026q;
        Object obj = jgyVar == null ? (ViewGroup) findViewById(C0100R.id.content_frame) : jgyVar.f34009a;
        if (obj != null) {
            ((ViewGroup) obj).addView(view, layoutParams);
        }
    }
}
