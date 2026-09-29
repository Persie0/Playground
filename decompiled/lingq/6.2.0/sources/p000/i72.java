package p000;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class i72 implements Closeable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f43616a;

    /* JADX INFO: renamed from: b */
    public final Object f43617b;

    public i72() {
        this.f43616a = 1;
        this.f43617b = new Inflater(true);
    }

    /* JADX INFO: renamed from: b */
    public static String m13705b(HttpURLConnection httpURLConnection) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line != null) {
                    sb.append(line);
                    sb.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
                throw th;
            }
        }
        bufferedReader.close();
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public static i72 m13706c() {
        return new i72();
    }

    /* JADX INFO: renamed from: a */
    public String m13707a() {
        boolean z;
        HttpURLConnection httpURLConnection = (HttpURLConnection) this.f43617b;
        try {
            try {
                z = httpURLConnection.getResponseCode() / 100 == 2;
            } catch (IOException | NullPointerException e) {
                tj5.m22152d("get error failed ", e);
                return e.getMessage();
            }
        } catch (IOException unused) {
        }
        if (z) {
            return null;
        }
        return "Unable to fetch " + httpURLConnection.getURL() + ". Failed with " + httpURLConnection.getResponseCode() + "\n" + m13705b(httpURLConnection);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.f43616a;
        Object obj = this.f43617b;
        switch (i) {
            case 0:
                ((HttpURLConnection) obj).disconnect();
                break;
            default:
                ((Inflater) obj).end();
                break;
        }
    }

    /* JADX INFO: renamed from: e */
    public d3d m13708e(byte[] bArr) {
        Inflater inflater = (Inflater) this.f43617b;
        inflater.setInput(bArr);
        try {
            return d3d.m10077d(ghb.m12663h(new p2d(this), 4096));
        } finally {
            inflater.reset();
        }
    }

    /* JADX INFO: renamed from: n */
    public d3d m13709n(ghb ghbVar) {
        Inflater inflater = (Inflater) this.f43617b;
        int iMo5375c = ghbVar.mo5375c();
        try {
            return d3d.m10077d(ghb.m12663h(new InflaterInputStream(new p2d(this, ghbVar), inflater, iMo5375c < 0 ? 4096 : Math.min(iMo5375c, 4096)), 4096));
        } finally {
            inflater.reset();
        }
    }

    public i72(HttpURLConnection httpURLConnection) {
        this.f43616a = 0;
        this.f43617b = httpURLConnection;
    }
}
