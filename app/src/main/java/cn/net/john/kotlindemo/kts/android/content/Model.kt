package cn.net.john.kotlindemo.kts.android.content

import android.os.Parcel
import android.os.Parcelable

/**
 * Created by Zrzc on 2017/5/24.
 */
data class Model(var test1: Int, var test2: Int): Parcelable {

    constructor(source: Parcel): this(source.readInt(), source.readInt())

    override fun describeContents(): Int {
        return 0
    }

    override fun writeToParcel(dest: Parcel?, flags: Int) {
        dest?.writeInt(this.test1)
        dest?.writeInt(this.test2)
    }

    companion object {
        @JvmField final val CREATOR: Parcelable.Creator<Model> = object : Parcelable.Creator<Model> {
            override fun createFromParcel(source: Parcel): Model{
                return Model(source)
            }

            override fun newArray(size: Int): Array<Model?> {
                return arrayOfNulls(size)
            }
        }
    }
}