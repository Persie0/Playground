package p000;

import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.GLES20;
import android.opengl.GLU;
import androidx.media3.common.util.GlUtil$GlException;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public abstract class oed {
    /* JADX INFO: renamed from: a */
    public static void m17953a() throws GlUtil$GlException {
        StringBuilder sb = new StringBuilder();
        AbstractC3489q9.m19779i(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        boolean z = false;
        int i = 0;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z) {
                sb.append('\n');
            }
            String strGluErrorString = GLU.gluErrorString(iGlGetError);
            if (strGluErrorString == null) {
                strGluErrorString = "error code: 0x" + Integer.toHexString(iGlGetError);
            }
            sb.append("glError: ");
            sb.append(strGluErrorString);
            Integer numValueOf = Integer.valueOf(iGlGetError);
            int i2 = i + 1;
            int iM3155f = b14.m3155f(objArrCopyOf.length, i2);
            if (iM3155f > objArrCopyOf.length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iM3155f);
            }
            objArrCopyOf[i] = numValueOf;
            z = true;
            i = i2;
        }
        if (z) {
            throw new GlUtil$GlException(sb.toString(), ImmutableList.m6283l(objArrCopyOf, i));
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m17954b(String str, boolean z) throws GlUtil$GlException {
        if (!z) {
            throw new GlUtil$GlException(str, ImmutableList.m6289v());
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m17955c(String str) throws GlUtil$GlException {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        m17954b("No EGL display.", !eGLDisplayEglGetDisplay.equals(EGL14.EGL_NO_DISPLAY));
        m17954b("Error in eglInitialize.", EGL14.eglInitialize(eGLDisplayEglGetDisplay, new int[1], 0, new int[1], 0));
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            String strEglQueryString = EGL14.eglQueryString(eGLDisplayEglGetDisplay, 12373);
            return strEglQueryString != null && strEglQueryString.contains(str);
        }
        throw new GlUtil$GlException("Error in getDefaultEglDisplay, error code: 0x" + Integer.toHexString(iEglGetError), ImmutableList.m6291y(Integer.valueOf(iEglGetError)));
    }

    /* JADX INFO: renamed from: d */
    public static void m17956d(int i, int i2) {
        String strM20597b;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strM20597b = red.m20597b("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    C3386nv.m17626m(wq1.m24124t(new StringBuilder(String.valueOf(i2).length() + 15), "negative size: ", i2));
                    return;
                }
                strM20597b = red.m20597b("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strM20597b);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m17957e(int i, int i2, int i3) {
        String strM17958f;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strM17958f = m17958f(i, "start index", i3);
            } else {
                strM17958f = (i2 < 0 || i2 > i3) ? m17958f(i2, "end index", i3) : red.m20597b("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strM17958f);
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m17958f(int i, String str, int i2) {
        if (i < 0) {
            return red.m20597b("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return red.m20597b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        C3386nv.m17626m(wq1.m24124t(new StringBuilder(String.valueOf(i2).length() + 15), "negative size: ", i2));
        return null;
    }
}
