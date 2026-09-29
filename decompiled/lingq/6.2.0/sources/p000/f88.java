package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class f88 {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f38630a = new ThreadLocal();

    /* JADX INFO: renamed from: b */
    public static final WeakHashMap f38631b = new WeakHashMap(0);

    /* JADX INFO: renamed from: c */
    public static final Object f38632c = new Object();

    /* JADX INFO: renamed from: a */
    public static Typeface m11597a(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return m11598b(context, i, new TypedValue(), 0, null, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b8  */
    /* JADX INFO: renamed from: b */
    public static Typeface m11598b(Context context, int i, TypedValue typedValue, int i2, AbstractC3584sr abstractC3584sr, boolean z, boolean z2) {
        Resources resources = context.getResources();
        int i3 = 1;
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        Typeface typefaceM17936b = null;
        if (string.startsWith("res/")) {
            Typeface typeface = (Typeface) oda.f54231b.m238d(oda.m17938d(resources, i, string, typedValue.assetCookie, i2));
            if (typeface != null) {
                if (abstractC3584sr != null) {
                    new Handler(Looper.getMainLooper()).post(new ks6(i3, abstractC3584sr, typeface));
                }
                typefaceM17936b = typeface;
            } else if (!z2) {
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        ob3 ob3VarM17097P = AbstractC3352my.m17097P(resources.getXml(i), resources);
                        if (ob3VarM17097P == null) {
                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                            if (abstractC3584sr != null) {
                                abstractC3584sr.m21650v(-3);
                            }
                        } else {
                            typefaceM17936b = oda.m17936b(context, ob3VarM17097P, resources, i, string, typedValue.assetCookie, i2, abstractC3584sr, z);
                        }
                    } else {
                        Typeface typefaceM17937c = oda.m17937c(resources, i, string, typedValue.assetCookie, i2);
                        if (abstractC3584sr != null) {
                            if (typefaceM17937c != null) {
                                new Handler(Looper.getMainLooper()).post(new ks6(i3, abstractC3584sr, typefaceM17937c));
                            } else {
                                abstractC3584sr.m21650v(-3);
                            }
                        }
                        typefaceM17936b = typefaceM17937c;
                    }
                } catch (IOException e) {
                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(string), e);
                    if (abstractC3584sr != null) {
                        abstractC3584sr.m21650v(-3);
                    }
                } catch (XmlPullParserException e2) {
                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), e2);
                    if (abstractC3584sr != null) {
                        abstractC3584sr.m21650v(-3);
                    }
                }
            }
        } else if (abstractC3584sr != null) {
            abstractC3584sr.m21650v(-3);
        }
        if (typefaceM17936b != null || abstractC3584sr != null || z2) {
            return typefaceM17936b;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }
}
