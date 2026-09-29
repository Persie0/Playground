package p237l7;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: renamed from: l7.a */
/* JADX INFO: loaded from: classes.dex */
public final class C7284a {

    /* JADX INFO: renamed from: a */
    public final BufferedOutputStream f40798a;

    /* JADX INFO: renamed from: b */
    public final FileDescriptor f40799b;

    /* JADX INFO: renamed from: c */
    public final RandomAccessFile f40800c;

    public C7284a(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        this.f40800c = randomAccessFile;
        this.f40799b = randomAccessFile.getFD();
        this.f40798a = new BufferedOutputStream(new FileOutputStream(randomAccessFile.getFD()));
    }
}
