package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class oah extends IllegalArgumentException {
    public oah(int i, int i2) {
        super("Unpaired surrogate at index " + i + " of " + i2);
    }
}
