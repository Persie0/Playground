package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class acv {
    /* JADX INFO: renamed from: a */
    public static ColorFilter m232a(Drawable drawable) {
        return drawable.getColorFilter();
    }

    /* JADX INFO: renamed from: b */
    public static void m233b(Drawable drawable, Resources.Theme theme) {
        drawable.applyTheme(theme);
    }

    /* JADX INFO: renamed from: c */
    public static void m234c(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        drawable.inflate(resources, xmlPullParser, attributeSet, theme);
    }

    /* JADX INFO: renamed from: d */
    public static void m235d(Drawable drawable, float f, float f2) {
        drawable.setHotspot(f, f2);
    }

    /* JADX INFO: renamed from: e */
    public static void m236e(Drawable drawable, int i, int i2, int i3, int i4) {
        drawable.setHotspotBounds(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: f */
    public static void m237f(Drawable drawable, int i) {
        drawable.setTint(i);
    }

    /* JADX INFO: renamed from: g */
    public static void m238g(Drawable drawable, ColorStateList colorStateList) {
        drawable.setTintList(colorStateList);
    }

    /* JADX INFO: renamed from: h */
    public static void m239h(Drawable drawable, PorterDuff.Mode mode) {
        drawable.setTintMode(mode);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m240i(Drawable drawable) {
        return drawable.canApplyTheme();
    }

    /* JADX INFO: renamed from: j */
    public static ByteBuffer m241j(String str, List list) {
        int iLimit = 8;
        for (int i = 0; i < list.size(); i++) {
            iLimit += ((ByteBuffer) list.get(i)).limit();
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iLimit);
        byteBufferAllocate.putInt(iLimit);
        byteBufferAllocate.put(str.getBytes(mrd.f41463a), 0, 4);
        for (int i2 = 0; i2 < list.size(); i2++) {
            byteBufferAllocate.put((ByteBuffer) list.get(i2));
        }
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    /* JADX INFO: renamed from: k */
    public static ByteBuffer m242k(String str, ByteBuffer byteBuffer) {
        return m243l(str.getBytes(mrd.f41463a), byteBuffer);
    }

    /* JADX INFO: renamed from: l */
    public static ByteBuffer m243l(byte[] bArr, ByteBuffer byteBuffer) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.limit() + 8);
        byteBufferAllocate.putInt(byteBuffer.limit() + 8);
        byteBufferAllocate.put(bArr, 0, 4);
        byteBufferAllocate.put(byteBuffer);
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }
}
