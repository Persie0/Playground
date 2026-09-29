package androidx.compose.p002ui.viewinterop;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.p002ui.input.nestedscroll.C0317a;
import androidx.compose.p002ui.node.Owner;
import androidx.compose.p002ui.platform.AbstractC0389a;
import androidx.compose.runtime.C0272a;
import p000.hl8;
import p000.il8;
import p000.sq5;
import p000.ui3;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
public final class ViewFactoryHolder extends AbstractC0442b {

    /* JADX INFO: renamed from: V */
    public final View f5165V;

    /* JADX INFO: renamed from: W */
    public final C0317a f5166W;

    /* JADX INFO: renamed from: a0 */
    public hl8 f5167a0;

    /* JADX INFO: renamed from: b0 */
    public vi3 f5168b0;

    /* JADX INFO: renamed from: c0 */
    public vi3 f5169c0;

    /* JADX INFO: renamed from: d0 */
    public vi3 f5170d0;

    public ViewFactoryHolder(Context context, vi3 vi3Var, C0272a c0272a, il8 il8Var, int i, Owner owner) {
        View view = (View) vi3Var.invoke(context);
        C0317a c0317a = new C0317a();
        super(context, c0272a, i, c0317a, view, owner);
        this.f5165V = view;
        this.f5166W = c0317a;
        setClipChildren(false);
        String strValueOf = String.valueOf(i);
        Object objMo10402e = il8Var != null ? il8Var.mo10402e(strValueOf) : null;
        SparseArray<Parcelable> sparseArray = objMo10402e instanceof SparseArray ? (SparseArray) objMo10402e : null;
        if (sparseArray != null) {
            view.restoreHierarchyState(sparseArray);
        }
        if (il8Var != null) {
            setSavableRegistryEntry(il8Var.mo10399a(strValueOf, new ui3() { // from class: androidx.compose.ui.viewinterop.ViewFactoryHolder$registerSaveStateProvider$1
                {
                    super(0);
                }

                @Override // p000.ui3
                /* JADX INFO: renamed from: a */
                public final Object mo0a() {
                    SparseArray<Parcelable> sparseArray2 = new SparseArray<>();
                    this.f5171b.f5165V.saveHierarchyState(sparseArray2);
                    return sparseArray2;
                }
            }));
        }
        AndroidView_androidKt$NoOpUpdate$1 androidView_androidKt$NoOpUpdate$1 = AndroidView_androidKt$NoOpUpdate$1.f5144b;
        this.f5168b0 = androidView_androidKt$NoOpUpdate$1;
        this.f5169c0 = androidView_androidKt$NoOpUpdate$1;
        this.f5170d0 = androidView_androidKt$NoOpUpdate$1;
    }

    /* JADX INFO: renamed from: n */
    public static final void m1884n(ViewFactoryHolder viewFactoryHolder) {
        viewFactoryHolder.setSavableRegistryEntry(null);
    }

    private final void setSavableRegistryEntry(hl8 hl8Var) {
        hl8 hl8Var2 = this.f5167a0;
        if (hl8Var2 != null) {
            ((sq5) hl8Var2).m21556E();
        }
        this.f5167a0 = hl8Var;
    }

    public final C0317a getDispatcher() {
        return this.f5166W;
    }

    public final vi3 getReleaseBlock() {
        return this.f5170d0;
    }

    public final vi3 getResetBlock() {
        return this.f5169c0;
    }

    public /* bridge */ /* synthetic */ AbstractC0389a getSubCompositionView() {
        return null;
    }

    public final vi3 getUpdateBlock() {
        return this.f5168b0;
    }

    public View getViewRoot() {
        return this;
    }

    public final void setReleaseBlock(vi3 vi3Var) {
        this.f5170d0 = vi3Var;
        setRelease(new ui3() { // from class: androidx.compose.ui.viewinterop.ViewFactoryHolder$releaseBlock$1
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                ViewFactoryHolder viewFactoryHolder = this.f5172b;
                viewFactoryHolder.getReleaseBlock().invoke(viewFactoryHolder.f5165V);
                ViewFactoryHolder.m1884n(viewFactoryHolder);
                return xfa.f68157a;
            }
        });
    }

    public final void setResetBlock(vi3 vi3Var) {
        this.f5169c0 = vi3Var;
        setReset(new ui3() { // from class: androidx.compose.ui.viewinterop.ViewFactoryHolder$resetBlock$1
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                ViewFactoryHolder viewFactoryHolder = this.f5173b;
                viewFactoryHolder.getResetBlock().invoke(viewFactoryHolder.f5165V);
                return xfa.f68157a;
            }
        });
    }

    public final void setUpdateBlock(vi3 vi3Var) {
        this.f5168b0 = vi3Var;
        setUpdate(new ui3() { // from class: androidx.compose.ui.viewinterop.ViewFactoryHolder$updateBlock$1
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                ViewFactoryHolder viewFactoryHolder = this.f5174b;
                viewFactoryHolder.getUpdateBlock().invoke(viewFactoryHolder.f5165V);
                return xfa.f68157a;
            }
        });
    }
}
