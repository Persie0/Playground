package dagger.hilt.android.internal.managers;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC1049o;
import androidx.view.InterfaceC1051q;
import androidx.view.Lifecycle;

/* JADX INFO: loaded from: classes2.dex */
public final class ViewComponentManager$FragmentContextWrapper extends ContextWrapper {

    /* JADX INFO: renamed from: a */
    public LayoutInflater f33082a;

    /* JADX INFO: renamed from: b */
    public LayoutInflater f33083b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1049o f33084c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewComponentManager$FragmentContextWrapper(Context context, Fragment fragment) {
        super(context);
        context.getClass();
        InterfaceC1049o interfaceC1049o = new InterfaceC1049o() { // from class: dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper.1
            @Override // androidx.view.InterfaceC1049o
            /* JADX INFO: renamed from: e */
            public final void mo800e(InterfaceC1051q interfaceC1051q, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    ViewComponentManager$FragmentContextWrapper viewComponentManager$FragmentContextWrapper = ViewComponentManager$FragmentContextWrapper.this;
                    viewComponentManager$FragmentContextWrapper.getClass();
                    viewComponentManager$FragmentContextWrapper.f33082a = null;
                    viewComponentManager$FragmentContextWrapper.f33083b = null;
                }
            }
        };
        this.f33084c = interfaceC1049o;
        this.f33082a = null;
        fragment.getClass();
        fragment.f6112l0.mo3883a(interfaceC1049o);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ViewComponentManager$FragmentContextWrapper(LayoutInflater layoutInflater, Fragment fragment) {
        layoutInflater.getClass();
        Context context = layoutInflater.getContext();
        context.getClass();
        super(context);
        InterfaceC1049o interfaceC1049o = new InterfaceC1049o() { // from class: dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper.1
            @Override // androidx.view.InterfaceC1049o
            /* JADX INFO: renamed from: e */
            public final void mo800e(InterfaceC1051q interfaceC1051q, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    ViewComponentManager$FragmentContextWrapper viewComponentManager$FragmentContextWrapper = ViewComponentManager$FragmentContextWrapper.this;
                    viewComponentManager$FragmentContextWrapper.getClass();
                    viewComponentManager$FragmentContextWrapper.f33082a = null;
                    viewComponentManager$FragmentContextWrapper.f33083b = null;
                }
            }
        };
        this.f33084c = interfaceC1049o;
        this.f33082a = layoutInflater;
        fragment.getClass();
        fragment.f6112l0.mo3883a(interfaceC1049o);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f33083b == null) {
            if (this.f33082a == null) {
                this.f33082a = (LayoutInflater) getBaseContext().getSystemService("layout_inflater");
            }
            this.f33083b = this.f33082a.cloneInContext(this);
        }
        return this.f33083b;
    }
}
