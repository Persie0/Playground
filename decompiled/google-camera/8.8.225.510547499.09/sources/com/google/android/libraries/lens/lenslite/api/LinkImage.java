package com.google.android.libraries.lens.lenslite.api;

import android.graphics.Bitmap;
import android.media.Image;
import p000.lku;
import p000.mqu;
import p000.mrm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class LinkImage {
    private mrm bitmap;
    private final mrm height;
    private mrm image;
    private mrm imageProxy;
    private final int linkImageType;
    private final mrm rotation;
    private final mrm width;

    private LinkImage(mrm mrmVar, mrm mrmVar2, mrm mrmVar3, int i) {
        mqu mquVar = mqu.f41450a;
        this.bitmap = mquVar;
        this.image = mquVar;
        this.imageProxy = mquVar;
        this.width = mrmVar;
        this.height = mrmVar2;
        this.rotation = mrmVar3;
        this.linkImageType = i;
    }

    public static LinkImage create(Bitmap bitmap, int i) {
        LinkImage linkImage = new LinkImage(mrm.m16829i(Integer.valueOf(bitmap.getWidth())), mrm.m16829i(Integer.valueOf(bitmap.getHeight())), mrm.m16829i(Integer.valueOf(i)), 1);
        linkImage.bitmap = mrm.m16829i(bitmap);
        return linkImage;
    }

    public void close() {
        if (this.image.mo16813g()) {
            ((Image) this.image.mo16809c()).close();
        } else if (this.imageProxy.mo16813g()) {
            ((ImageProxy) this.imageProxy.mo16809c()).close();
        }
    }

    public mrm getBitmap() {
        return this.bitmap;
    }

    public int getHeight() {
        lku.m15613H(this.height.mo16813g());
        return ((Integer) this.height.mo16809c()).intValue();
    }

    public mrm getImage() {
        return this.image;
    }

    public mrm getImageProxy() {
        return this.imageProxy;
    }

    public int getRotation() {
        lku.m15613H(this.height.mo16813g());
        return ((Integer) this.rotation.mo16809c()).intValue();
    }

    public int getType() {
        return this.linkImageType;
    }

    public int getWidth() {
        lku.m15613H(this.width.mo16813g());
        return ((Integer) this.width.mo16809c()).intValue();
    }

    public static LinkImage create(Image image, int i) {
        LinkImage linkImage = new LinkImage(mrm.m16829i(Integer.valueOf(image.getWidth())), mrm.m16829i(Integer.valueOf(image.getHeight())), mrm.m16829i(Integer.valueOf(i)), 2);
        linkImage.image = mrm.m16829i(image);
        return linkImage;
    }

    public static LinkImage create(ImageProxy imageProxy, int i) {
        LinkImage linkImage = new LinkImage(mrm.m16829i(Integer.valueOf(imageProxy.getWidth())), mrm.m16829i(Integer.valueOf(imageProxy.getHeight())), mrm.m16829i(Integer.valueOf(i)), 3);
        linkImage.imageProxy = mrm.m16829i(imageProxy);
        return linkImage;
    }
}
