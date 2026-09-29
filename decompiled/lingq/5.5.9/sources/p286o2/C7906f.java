package p286o2;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;
import p312p2.C8173e;
import p326q.C8450f;
import p446w2.C9804b;

/* JADX INFO: renamed from: o2.f */
/* JADX INFO: loaded from: classes.dex */
public final class C7906f {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal<TypedValue> f43056a = new ThreadLocal<>();

    /* JADX INFO: renamed from: b */
    public static final WeakHashMap<d, SparseArray<c>> f43057b = new WeakHashMap<>(0);

    /* JADX INFO: renamed from: c */
    public static final Object f43058c = new Object();

    /* JADX INFO: renamed from: o2.f$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static Drawable m15676a(Resources resources, int i10, Resources.Theme theme) {
            return resources.getDrawable(i10, theme);
        }

        /* JADX INFO: renamed from: b */
        public static Drawable m15677b(Resources resources, int i10, int i11, Resources.Theme theme) {
            return resources.getDrawableForDensity(i10, i11, theme);
        }
    }

    /* JADX INFO: renamed from: o2.f$b */
    public static class b {
        /* JADX INFO: renamed from: a */
        public static int m15678a(Resources resources, int i10, Resources.Theme theme) {
            return resources.getColor(i10, theme);
        }

        /* JADX INFO: renamed from: b */
        public static ColorStateList m15679b(Resources resources, int i10, Resources.Theme theme) {
            return resources.getColorStateList(i10, theme);
        }
    }

    /* JADX INFO: renamed from: o2.f$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public final ColorStateList f43059a;

        /* JADX INFO: renamed from: b */
        public final Configuration f43060b;

        /* JADX INFO: renamed from: c */
        public final int f43061c;

        public c(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            this.f43059a = colorStateList;
            this.f43060b = configuration;
            this.f43061c = theme == null ? 0 : theme.hashCode();
        }
    }

    /* JADX INFO: renamed from: o2.f$d */
    public static final class d {

        /* JADX INFO: renamed from: a */
        public final Resources f43062a;

        /* JADX INFO: renamed from: b */
        public final Resources.Theme f43063b;

        public d(Resources resources, Resources.Theme theme) {
            this.f43062a = resources;
            this.f43063b = theme;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class == obj.getClass()) {
                d dVar = (d) obj;
                return this.f43062a.equals(dVar.f43062a) && C9804b.m18286a(this.f43063b, dVar.f43063b);
            }
            return false;
        }

        public final int hashCode() {
            return C9804b.m18287b(this.f43062a, this.f43063b);
        }
    }

    /* JADX INFO: renamed from: o2.f$e */
    public static abstract class e {
        /* JADX INFO: renamed from: a */
        public final void m15680a(final int i10) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: o2.h
                @Override // java.lang.Runnable
                public final void run() {
                    this.f43067a.mo1296c(i10);
                }
            });
        }

        /* JADX INFO: renamed from: b */
        public final void m15681b(Typeface typeface) {
            new Handler(Looper.getMainLooper()).post(new RunnableC7907g(this, 0, typeface));
        }

        /* JADX INFO: renamed from: c */
        public abstract void mo1296c(int i10);

        /* JADX INFO: renamed from: d */
        public abstract void mo1297d(Typeface typeface);
    }

    /* JADX INFO: renamed from: a */
    public static Typeface m15674a(int i10, Context context) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m15675b(context, i10, new TypedValue(), 0, null, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b7  */
    /* JADX INFO: renamed from: b */
    public static Typeface m15675b(Context context, int i10, TypedValue typedValue, int i11, e eVar, boolean z10, boolean z11) {
        Typeface typefaceM16516b;
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i10) + "\" (" + Integer.toHexString(i10) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        if (string.startsWith("res/")) {
            int i12 = typedValue.assetCookie;
            C8450f<String, Typeface> c8450f = C8173e.f44310b;
            typefaceM16516b = c8450f.m16516b(C8173e.m16231b(resources, i10, string, i12, i11));
            if (typefaceM16516b != null) {
                if (eVar != null) {
                    eVar.m15681b(typefaceM16516b);
                }
            } else if (!z11) {
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        C7904d.b bVarM15670a = C7904d.m15670a(resources.getXml(i10), resources);
                        if (bVarM15670a == null) {
                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                            if (eVar != null) {
                                eVar.m15680a(-3);
                            }
                        } else {
                            typefaceM16516b = C8173e.m16230a(context, bVarM15670a, resources, i10, string, typedValue.assetCookie, i11, eVar, z10);
                        }
                    } else {
                        int i13 = typedValue.assetCookie;
                        typefaceM16516b = C8173e.f44309a.mo16238c(context, resources, i10, string, i11);
                        if (typefaceM16516b != null) {
                            c8450f.m16517c(C8173e.m16231b(resources, i10, string, i13, i11), typefaceM16516b);
                        }
                        if (eVar != null) {
                            if (typefaceM16516b != null) {
                                eVar.m15681b(typefaceM16516b);
                            } else {
                                eVar.m15680a(-3);
                            }
                        }
                    }
                } catch (IOException e10) {
                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(string), e10);
                    if (eVar != null) {
                        eVar.m15680a(-3);
                    }
                } catch (XmlPullParserException e11) {
                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), e11);
                    if (eVar != null) {
                        eVar.m15680a(-3);
                    }
                }
            }
            if (typefaceM16516b == null || eVar != null || z11) {
                return typefaceM16516b;
            }
            throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i10) + " could not be retrieved.");
        }
        if (eVar != null) {
            eVar.m15680a(-3);
        }
        typefaceM16516b = null;
        if (typefaceM16516b == null) {
        }
        return typefaceM16516b;
    }
}
