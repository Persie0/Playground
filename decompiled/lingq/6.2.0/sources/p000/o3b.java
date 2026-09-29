package p000;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.FacebookDialogException;

/* JADX INFO: loaded from: classes2.dex */
public final class o3b extends g3b {

    /* JADX INFO: renamed from: K */
    public static final /* synthetic */ int f53809K = 0;

    /* JADX INFO: renamed from: J */
    public final String f53810J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3b(id3 id3Var, String str, String str2) {
        super(id3Var, str);
        id3Var.getClass();
        str2.getClass();
        this.f53810J = str2;
        this.f40140b = str2;
    }

    @Override // p000.g3b
    /* JADX INFO: renamed from: c */
    public final Bundle mo12345c(String str) {
        String str2 = this.f53810J;
        if (str2.length() <= 0 || !cl9.m4842Y(str, str2, false)) {
            return super.mo12345c(str);
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            getContext().startActivity(intent);
            dismiss();
        } catch (Exception e) {
            m12347e(new FacebookDialogException("Failed to launch custom redirect: " + e.getMessage(), -1, str));
        }
        return new Bundle();
    }
}
