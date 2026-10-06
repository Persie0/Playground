package p000;

import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import com.google.android.apps.camera.evcomp.AZCp.HRLmc;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class bzf extends Fragment {

    /* JADX INFO: renamed from: a */
    public final byu f4800a;

    /* JADX INFO: renamed from: b */
    public final bzh f4801b;

    /* JADX INFO: renamed from: c */
    public bpp f4802c;

    /* JADX INFO: renamed from: d */
    private final Set f4803d;

    /* JADX INFO: renamed from: e */
    private bzf f4804e;

    public bzf() {
        byu byuVar = new byu();
        this.f4801b = new bze(this);
        this.f4803d = new HashSet();
        this.f4800a = byuVar;
    }

    /* JADX INFO: renamed from: a */
    private final void m3209a() {
        bzf bzfVar = this.f4804e;
        if (bzfVar != null) {
            bzfVar.f4803d.remove(this);
            this.f4804e = null;
        }
    }

    @Override // android.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            m3209a();
            bzf bzfVarM3215c = box.m2826b(activity).f4035d.m3215c(activity.getFragmentManager());
            this.f4804e = bzfVarM3215c;
            if (equals(bzfVarM3215c)) {
                return;
            }
            this.f4804e.f4803d.add(this);
        } catch (IllegalStateException e) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e);
            }
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f4800a.m3201b();
        m3209a();
    }

    @Override // android.app.Fragment
    public final void onDetach() {
        super.onDetach();
        m3209a();
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f4800a.m3202c();
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f4800a.m3203d();
    }

    @Override // android.app.Fragment
    public final String toString() {
        String string = super.toString();
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = null;
        }
        return string + "{parent=" + String.valueOf(parentFragment) + HRLmc.vlHcor;
    }
}
