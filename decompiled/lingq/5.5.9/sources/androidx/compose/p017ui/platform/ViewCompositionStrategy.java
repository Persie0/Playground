package androidx.compose.p017ui.platform;

import android.view.View;
import androidx.view.InterfaceC1051q;
import androidx.view.ViewTreeLifecycleOwner;
import cm.InterfaceC2041a;
import dm.C5207g;
import kotlin.jvm.internal.Ref$ObjectRef;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public interface ViewCompositionStrategy {

    public static final class DisposeOnViewTreeLifecycleDestroyed implements ViewCompositionStrategy {

        /* JADX INFO: renamed from: a */
        public static final DisposeOnViewTreeLifecycleDestroyed f4204a = new DisposeOnViewTreeLifecycleDestroyed();

        /* JADX INFO: renamed from: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$a */
        public static final class ViewOnAttachStateChangeListenerC0590a implements View.OnAttachStateChangeListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ AbstractComposeView f4205a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Ref$ObjectRef<InterfaceC2041a<C9072e>> f4206b;

            public ViewOnAttachStateChangeListenerC0590a(AbstractComposeView abstractComposeView, Ref$ObjectRef<InterfaceC2041a<C9072e>> ref$ObjectRef) {
                this.f4205a = abstractComposeView;
                this.f4206b = ref$ObjectRef;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [T, cm.a] */
            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view) {
                C5207g.m11111f(view, "v");
                AbstractComposeView abstractComposeView = this.f4205a;
                InterfaceC1051q interfaceC1051qM3911a = ViewTreeLifecycleOwner.m3911a(abstractComposeView);
                if (interfaceC1051qM3911a != null) {
                    this.f4206b.f38127a = C0644m1.m2424a(abstractComposeView, interfaceC1051qM3911a.mo786G());
                    abstractComposeView.removeOnAttachStateChangeListener(this);
                } else {
                    throw new IllegalStateException(("View tree for " + abstractComposeView + " has no ViewTreeLifecycleOwner").toString());
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view) {
                C5207g.m11111f(view, "v");
            }
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [T, androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$1] */
        @Override // androidx.compose.p017ui.platform.ViewCompositionStrategy
        /* JADX INFO: renamed from: a */
        public final InterfaceC2041a<C9072e> mo2322a(final AbstractComposeView abstractComposeView) {
            C5207g.m11111f(abstractComposeView, "view");
            if (!abstractComposeView.isAttachedToWindow()) {
                final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                final ViewOnAttachStateChangeListenerC0590a viewOnAttachStateChangeListenerC0590a = new ViewOnAttachStateChangeListenerC0590a(abstractComposeView, ref$ObjectRef);
                abstractComposeView.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0590a);
                ref$ObjectRef.f38127a = new InterfaceC2041a<C9072e>() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // cm.InterfaceC2041a
                    /* JADX INFO: renamed from: E */
                    public final C9072e mo807E() {
                        abstractComposeView.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0590a);
                        return C9072e.f47360a;
                    }
                };
                return new InterfaceC2041a<C9072e>() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // cm.InterfaceC2041a
                    /* JADX INFO: renamed from: E */
                    public final C9072e mo807E() {
                        ref$ObjectRef.f38127a.mo807E();
                        return C9072e.f47360a;
                    }
                };
            }
            InterfaceC1051q interfaceC1051qM3911a = ViewTreeLifecycleOwner.m3911a(abstractComposeView);
            if (interfaceC1051qM3911a != null) {
                return C0644m1.m2424a(abstractComposeView, interfaceC1051qM3911a.mo786G());
            }
            throw new IllegalStateException(("View tree for " + abstractComposeView + " has no ViewTreeLifecycleOwner").toString());
        }
    }

    /* JADX INFO: renamed from: a */
    InterfaceC2041a<C9072e> mo2322a(AbstractComposeView abstractComposeView);
}
