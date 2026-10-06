package p000;

import android.widget.Button;
import com.google.p020vr.vrcore.controller.api.DJK.rmwTRjObXLGH;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class iwo {

    /* JADX INFO: renamed from: a */
    final CharSequence f32493a;

    /* JADX INFO: renamed from: b */
    final CharSequence f32494b;

    /* JADX INFO: renamed from: c */
    final CharSequence f32495c;

    public iwo(CharSequence charSequence, String str, String str2) {
        this.f32493a = charSequence == null ? Button.class.getName() : charSequence;
        this.f32494b = str == null ? "" : str;
        this.f32495c = str2 == null ? "" : str2;
    }

    public final String toString() {
        return "State{className=" + String.valueOf(this.f32493a) + ", primaryText=" + this.f32494b.toString() + rmwTRjObXLGH.VIbDCBocnnXNZV + this.f32495c.toString() + ", isCheckable=true}";
    }
}
