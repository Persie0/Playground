package p000;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kvi implements kvn {

    /* JADX INFO: renamed from: a */
    private final Context f37353a;

    /* JADX INFO: renamed from: b */
    private final String f37354b;

    /* JADX INFO: renamed from: c */
    private final dsx f37355c;

    public kvi(Context context, dsx dsxVar, String str, byte[] bArr, byte[] bArr2) {
        this.f37355c = dsxVar;
        this.f37353a = context;
        this.f37354b = str;
    }

    @Override // p000.kvn
    /* JADX INFO: renamed from: b */
    public final void mo14931b() {
        ((ClipboardManager) this.f37353a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("simple text", this.f37354b));
        String strConcat = this.f37354b;
        if (strConcat.length() > 50) {
            strConcat = String.valueOf(strConcat.substring(0, 50)).concat("...");
        }
        this.f37355c.m6699n(this.f37353a.getString(C0100R.string.text_copied_to_clipboard) + ": " + strConcat);
    }
}
