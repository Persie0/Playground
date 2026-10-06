package com.google.p020vr.vrcore.library.api;

import p000.cbr;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ObjectWrapper extends cbr {
    private final Object wrappedObject;

    private ObjectWrapper(Object obj) {
        super("com.google.vr.vrcore.library.api.IObjectWrapper");
        this.wrappedObject = obj;
    }

    /* JADX INFO: renamed from: b */
    public static cbr m5207b(Object obj) {
        return new ObjectWrapper(obj);
    }
}
