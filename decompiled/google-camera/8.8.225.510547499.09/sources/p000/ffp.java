package p000;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ffp {
    public ffp() {
        new ArrayDeque();
    }

    public ffp(byte[] bArr) {
    }

    /* JADX INFO: renamed from: b */
    public static final InputStream m8356b(String str) {
        try {
            return new BufferedInputStream(new FileInputStream(str));
        } catch (FileNotFoundException e) {
            ((nbe) ((nbe) fev.f21578a.m17252c()).mo17276G((char) 2164)).mo17293r("Could not read file: %s, perhaps it is not a panorama.", str);
            return null;
        }
    }
}
