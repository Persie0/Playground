package p000;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes2.dex */
public final class hoa extends loa {
    public hoa() {
    }

    /* JADX INFO: renamed from: e */
    public final void m13418e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
            TypedArray typedArrayM17383g = nda.m17383g(resources, theme, attributeSet, xx1.f68920d);
            String string = typedArrayM17383g.getString(0);
            if (string != null) {
                this.f49950b = string;
            }
            String string2 = typedArrayM17383g.getString(1);
            if (string2 != null) {
                this.f49949a = tzb.m22362b(string2);
            }
            this.f49951c = nda.m17382f(xmlPullParser, "fillType") ? typedArrayM17383g.getInt(2, 0) : 0;
            typedArrayM17383g.recycle();
        }
    }

    public hoa(hoa hoaVar) {
        super(hoaVar);
    }
}
