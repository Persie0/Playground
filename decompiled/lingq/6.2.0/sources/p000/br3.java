package p000;

import android.adservices.measurement.MeasurementManager;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class br3 {
    /* JADX INFO: renamed from: A */
    public static /* bridge */ /* synthetic */ boolean m4116A(Object obj) {
        return obj instanceof JoinOrSplitGesture;
    }

    /* JADX INFO: renamed from: B */
    public static /* bridge */ /* synthetic */ boolean m4117B(Object obj) {
        return obj instanceof DeleteGesture;
    }

    /* JADX INFO: renamed from: C */
    public static /* bridge */ /* synthetic */ boolean m4118C(Object obj) {
        return obj instanceof SelectRangeGesture;
    }

    /* JADX INFO: renamed from: D */
    public static /* bridge */ /* synthetic */ boolean m4119D(Object obj) {
        return obj instanceof DeleteRangeGesture;
    }

    /* JADX INFO: renamed from: c */
    public static /* bridge */ /* synthetic */ MeasurementManager m4122c(Object obj) {
        return (MeasurementManager) obj;
    }

    /* JADX INFO: renamed from: j */
    public static /* bridge */ /* synthetic */ DeleteGesture m4129j(Object obj) {
        return (DeleteGesture) obj;
    }

    /* JADX INFO: renamed from: k */
    public static /* bridge */ /* synthetic */ DeleteRangeGesture m4130k(Object obj) {
        return (DeleteRangeGesture) obj;
    }

    /* JADX INFO: renamed from: l */
    public static /* bridge */ /* synthetic */ HandwritingGesture m4131l(Object obj) {
        return (HandwritingGesture) obj;
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ InsertGesture m4132m(Object obj) {
        return (InsertGesture) obj;
    }

    /* JADX INFO: renamed from: n */
    public static /* bridge */ /* synthetic */ JoinOrSplitGesture m4133n(Object obj) {
        return (JoinOrSplitGesture) obj;
    }

    /* JADX INFO: renamed from: o */
    public static /* bridge */ /* synthetic */ RemoveSpaceGesture m4134o(Object obj) {
        return (RemoveSpaceGesture) obj;
    }

    /* JADX INFO: renamed from: p */
    public static /* bridge */ /* synthetic */ SelectGesture m4135p(Object obj) {
        return (SelectGesture) obj;
    }

    /* JADX INFO: renamed from: q */
    public static /* bridge */ /* synthetic */ SelectRangeGesture m4136q(Object obj) {
        return (SelectRangeGesture) obj;
    }

    /* JADX INFO: renamed from: t */
    public static /* bridge */ /* synthetic */ boolean m4139t(Object obj) {
        return obj instanceof InsertGesture;
    }

    /* JADX INFO: renamed from: y */
    public static /* bridge */ /* synthetic */ HandwritingGesture m4144y(Object obj) {
        return (HandwritingGesture) obj;
    }

    /* JADX INFO: renamed from: z */
    public static /* bridge */ /* synthetic */ boolean m4145z(Object obj) {
        return obj instanceof RemoveSpaceGesture;
    }
}
