package p000;

import android.content.Context;
import android.util.Log;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bzn extends ComponentCallbacksC0077bw {

    /* JADX INFO: renamed from: a */
    public final byu f4822a;

    /* JADX INFO: renamed from: b */
    private final Set f4823b;

    /* JADX INFO: renamed from: c */
    private bzn f4824c;

    public bzn() {
        byu byuVar = new byu();
        this.f4823b = new HashSet();
        this.f4822a = byuVar;
    }

    /* JADX INFO: renamed from: c */
    private final void m3227c() {
        bzn bznVar = this.f4824c;
        if (bznVar != null) {
            bznVar.f4823b.remove(this);
            this.f4824c = null;
        }
    }

    @Override // p000.ComponentCallbacksC0077bw
    public final void onAttach(Context context) {
        super.onAttach(context);
        ComponentCallbacksC0077bw componentCallbacksC0077bw = this;
        while (true) {
            ComponentCallbacksC0077bw componentCallbacksC0077bw2 = componentCallbacksC0077bw.f4574B;
            if (componentCallbacksC0077bw2 == null) {
                break;
            } else {
                componentCallbacksC0077bw = componentCallbacksC0077bw2;
            }
        }
        C0111cq c0111cq = componentCallbacksC0077bw.f4623y;
        if (c0111cq == null) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root, ancestor detached");
                return;
            }
            return;
        }
        try {
            Context context2 = getContext();
            m3227c();
            bzg bzgVar = box.m2826b(context2).f4035d;
            bzn bznVar = (bzn) bzgVar.f4807b.get(c0111cq);
            if (bznVar == null && (bznVar = (bzn) c0111cq.m5325e("com.bumptech.glide.manager")) == null) {
                bznVar = new bzn();
                bzgVar.f4807b.put(c0111cq, bznVar);
                AbstractC0118cx abstractC0118cxM5327i = c0111cq.m5327i();
                abstractC0118cxM5327i.m5699o(bznVar, "com.bumptech.glide.manager");
                abstractC0118cxM5327i.mo2022i();
                bzgVar.f4808c.obtainMessage(2, c0111cq).sendToTarget();
            }
            this.f4824c = bznVar;
            if (equals(bznVar)) {
                return;
            }
            this.f4824c.f4823b.add(this);
        } catch (IllegalStateException e) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root", e);
            }
        }
    }

    @Override // p000.ComponentCallbacksC0077bw
    public final void onDestroy() {
        super.onDestroy();
        this.f4822a.m3201b();
        m3227c();
    }

    @Override // p000.ComponentCallbacksC0077bw
    public final void onDetach() {
        super.onDetach();
        m3227c();
    }

    @Override // p000.ComponentCallbacksC0077bw
    public final void onStart() {
        super.onStart();
        this.f4822a.m3202c();
    }

    @Override // p000.ComponentCallbacksC0077bw
    public final void onStop() {
        super.onStop();
        this.f4822a.m3203d();
    }

    @Override // p000.ComponentCallbacksC0077bw
    public final String toString() {
        String string = super.toString();
        ComponentCallbacksC0077bw componentCallbacksC0077bw = this.f4574B;
        if (componentCallbacksC0077bw == null) {
            componentCallbacksC0077bw = null;
        }
        return string + "{parent=" + String.valueOf(componentCallbacksC0077bw) + "}";
    }
}
