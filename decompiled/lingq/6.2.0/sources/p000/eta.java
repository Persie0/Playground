package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;

/* JADX INFO: loaded from: classes.dex */
public final class eta extends ContextWrapper {

    /* JADX INFO: renamed from: a */
    public LayoutInflater f37832a;

    /* JADX INFO: renamed from: b */
    public LayoutInflater f37833b;

    /* JADX WARN: Illegal instructions before constructor call */
    public eta(LayoutInflater layoutInflater, AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c) {
        layoutInflater.getClass();
        Context context = layoutInflater.getContext();
        context.getClass();
        super(context);
        d28 d28Var = new d28(this, 6);
        this.f37832a = layoutInflater;
        abstractComponentCallbacksC0635c.getClass();
        abstractComponentCallbacksC0635c.f5709m0.mo21323g(d28Var);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f37833b == null) {
            if (this.f37832a == null) {
                this.f37832a = (LayoutInflater) getBaseContext().getSystemService("layout_inflater");
            }
            this.f37833b = this.f37832a.cloneInContext(this);
        }
        return this.f37833b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eta(Context context, AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c) {
        super(context);
        context.getClass();
        d28 d28Var = new d28(this, 6);
        this.f37832a = null;
        abstractComponentCallbacksC0635c.getClass();
        abstractComponentCallbacksC0635c.f5709m0.mo21323g(d28Var);
    }
}
