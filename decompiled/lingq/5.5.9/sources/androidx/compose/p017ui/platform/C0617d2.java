package androidx.compose.p017ui.platform;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.C0477b;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.snapshots.SnapshotKt;
import cm.InterfaceC2052l;
import com.linguist.R;
import dm.C5207g;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.WeakHashMap;
import kotlinx.coroutines.channels.AbstractChannel;
import no.C7828f;
import p081e0.AbstractC5311g;
import p081e0.C5315i;
import p081e0.InterfaceC5308f;
import p166i1.C6158m0;
import p260m8.C7499b;
import p338qd.C8573r0;
import sl.C9072e;

/* JADX INFO: renamed from: androidx.compose.ui.platform.d2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0617d2 {

    /* JADX INFO: renamed from: a */
    public static final ViewGroup.LayoutParams f4304a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Code duplicated, block: B:21:0x006f  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:34:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:37:0x0104  */
    /* JADX INFO: renamed from: a */
    public static final InterfaceC5308f m2347a(AbstractComposeView abstractComposeView, AbstractC5311g abstractC5311g, ComposableLambdaImpl composableLambdaImpl) {
        AndroidComposeView androidComposeView;
        C0477b c0477b;
        Object tag;
        C5207g.m11111f(abstractComposeView, "<this>");
        C5207g.m11111f(abstractC5311g, "parent");
        boolean z10 = false;
        WrappedComposition wrappedComposition = null;
        if (C0652p0.f4333a.compareAndSet(false, true)) {
            final AbstractChannel abstractChannelM16738m = C8573r0.m16738m(-1, null, 6);
            C7828f.m15570d(C7499b.m14930b(AndroidUiDispatcher.f4106H.getValue()), null, null, new GlobalSnapshotManager$ensureStarted$1(abstractChannelM16738m, null), 3);
            InterfaceC2052l<Object, C9072e> interfaceC2052l = new InterfaceC2052l<Object, C9072e>() { // from class: androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final C9072e mo528n(Object obj) {
                    C5207g.m11111f(obj, "it");
                    C9072e c9072e = C9072e.f47360a;
                    abstractChannelM16738m.mo16479j(c9072e);
                    return c9072e;
                }
            };
            synchronized (SnapshotKt.f3262c) {
                SnapshotKt.f3267h.add(interfaceC2052l);
            }
            SnapshotKt.m1882a();
        }
        if (abstractComposeView.getChildCount() > 0) {
            View childAt = abstractComposeView.getChildAt(0);
            if (childAt instanceof AndroidComposeView) {
                androidComposeView = (AndroidComposeView) childAt;
            }
            if (androidComposeView == null) {
                Context context = abstractComposeView.getContext();
                C5207g.m11110e(context, "context");
                androidComposeView = new AndroidComposeView(context);
                abstractComposeView.addView(androidComposeView.getView(), f4304a);
            }
            if (Build.VERSION.SDK_INT >= 29 && (!C0613c2.f4292a.m2345a(androidComposeView).isEmpty())) {
                z10 = true;
            }
            if (z10) {
                androidComposeView.setTag(R.id.inspection_slot_table_set, Collections.newSetFromMap(new WeakHashMap()));
                InterfaceC2052l<C0661s0, C9072e> interfaceC2052l2 = InspectableValueKt.f4184a;
                try {
                    Field declaredField = InspectableValueKt.class.getDeclaredField("b");
                    declaredField.setAccessible(true);
                    declaredField.setBoolean(null, true);
                } catch (Exception unused) {
                    Log.w("Wrapper", "Could not access isDebugInspectorInfoEnabled. Please set explicitly.");
                }
            }
            C6158m0 c6158m0 = new C6158m0(androidComposeView.getRoot());
            Object obj = C5315i.f33586a;
            c0477b = new C0477b(abstractC5311g, c6158m0);
            tag = androidComposeView.getView().getTag(R.id.wrapped_composition_tag);
            if (tag instanceof WrappedComposition) {
                wrappedComposition = (WrappedComposition) tag;
            }
            if (wrappedComposition == null) {
                wrappedComposition = new WrappedComposition(androidComposeView, c0477b);
                androidComposeView.getView().setTag(R.id.wrapped_composition_tag, wrappedComposition);
            }
            wrappedComposition.mo1726f(composableLambdaImpl);
            return wrappedComposition;
        }
        abstractComposeView.removeAllViews();
        androidComposeView = null;
        if (androidComposeView == null) {
            Context context2 = abstractComposeView.getContext();
            C5207g.m11110e(context2, "context");
            androidComposeView = new AndroidComposeView(context2);
            abstractComposeView.addView(androidComposeView.getView(), f4304a);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            z10 = true;
        }
        if (z10) {
            androidComposeView.setTag(R.id.inspection_slot_table_set, Collections.newSetFromMap(new WeakHashMap()));
            InterfaceC2052l<C0661s0, C9072e> interfaceC2052l3 = InspectableValueKt.f4184a;
            Field declaredField2 = InspectableValueKt.class.getDeclaredField("b");
            declaredField2.setAccessible(true);
            declaredField2.setBoolean(null, true);
        }
        C6158m0 c6158m1 = new C6158m0(androidComposeView.getRoot());
        Object obj2 = C5315i.f33586a;
        c0477b = new C0477b(abstractC5311g, c6158m1);
        tag = androidComposeView.getView().getTag(R.id.wrapped_composition_tag);
        if (tag instanceof WrappedComposition) {
            wrappedComposition = (WrappedComposition) tag;
        }
        if (wrappedComposition == null) {
            wrappedComposition = new WrappedComposition(androidComposeView, c0477b);
            androidComposeView.getView().setTag(R.id.wrapped_composition_tag, wrappedComposition);
        }
        wrappedComposition.mo1726f(composableLambdaImpl);
        return wrappedComposition;
    }
}
