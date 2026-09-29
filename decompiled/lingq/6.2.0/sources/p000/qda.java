package p000;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class qda extends e41 {
    @Override // p000.e41
    /* JADX INFO: renamed from: i */
    public final Font mo10842i(dc3 dc3Var) {
        Font fontM17940f;
        String strM10277a = dc3Var.m10277a();
        if (strM10277a != null) {
            Typeface typefaceCreate = Typeface.create(strM10277a, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
                typefaceCreate = null;
            }
            if (typefaceCreate != null && (fontM17940f = oda.m17940f(typefaceCreate)) != null) {
                if (TextUtils.isEmpty(dc3Var.m10280d())) {
                    return fontM17940f;
                }
                try {
                    return new Font.Builder(fontM17940f).setFontVariationSettings(dc3Var.m10280d()).build();
                } catch (IOException unused) {
                    Log.e("TypefaceCompatApi31Impl", "Failed to clone Font instance. Fall back to provider font.");
                    return null;
                }
            }
        }
        return null;
    }
}
