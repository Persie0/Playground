package p000;

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.clockwork.common.wearable.wearmaterial.picker.WearPickerColumn;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iyg {

    /* JADX INFO: renamed from: a */
    public int f32639a;

    /* JADX INFO: renamed from: b */
    public int f32640b;

    /* JADX INFO: renamed from: c */
    public int f32641c;

    /* JADX INFO: renamed from: d */
    public int f32642d;

    /* JADX INFO: renamed from: e */
    public int f32643e;

    public iyg() {
    }

    public iyg(byte[] bArr) {
        this.f32643e = 0;
    }

    /* JADX INFO: renamed from: f */
    static final int m11900f(int i, int i2) {
        if (i > i2) {
            return 1;
        }
        return i == i2 ? 2 : 4;
    }

    /* JADX INFO: renamed from: a */
    public final int m11901a(WearPickerColumn wearPickerColumn, int i, int i2, View view) {
        if (view.getVisibility() != 8) {
            wearPickerColumn.measureChildWithMargins(view, i, 0, i2, 0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            this.f32641c = view.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            this.f32642d = view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            this.f32643e = View.combineMeasuredStates(this.f32643e, view.getMeasuredState());
        } else {
            this.f32641c = 0;
            this.f32642d = 0;
        }
        this.f32639a = Math.max(this.f32639a, this.f32641c);
        return this.f32642d;
    }

    /* JADX INFO: renamed from: b */
    public final void m11902b(int i) {
        this.f32643e = i | this.f32643e;
    }

    /* JADX INFO: renamed from: c */
    public final void m11903c() {
        this.f32643e = 0;
    }

    /* JADX INFO: renamed from: d */
    public final void m11904d(int i, int i2, int i3, int i4) {
        this.f32641c = i;
        this.f32642d = i2;
        this.f32639a = i3;
        this.f32640b = i4;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m11905e() {
        int i = this.f32643e;
        if ((i & 7) != 0 && (m11900f(this.f32639a, this.f32641c) & i) == 0) {
            return false;
        }
        if ((i & 112) != 0 && ((m11900f(this.f32639a, this.f32642d) << 4) & i) == 0) {
            return false;
        }
        if ((i & 1792) == 0 || ((m11900f(this.f32640b, this.f32641c) << 8) & i) != 0) {
            return (i & 28672) == 0 || (i & (m11900f(this.f32640b, this.f32642d) << 12)) != 0;
        }
        return false;
    }
}
